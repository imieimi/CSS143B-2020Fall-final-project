package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();

        //my code starts here:
        List<List<Integer>> docNum = new ArrayList<>();

        for(int i = 1; i < docs.size(); i++){
            docNum.add(new ArrayList<>());
            for(int b = 0; b < docs.get(i).length(); b++){
                indexes.put(docs.get(b), docNum);
            }
        }
        return indexes;
    }
}