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
            for(int b = 0; b < docs.get(i).length(); b++){
                docNum.get(i).add(b);
            }
            for(int c = 0; c < docNum.get(i).size(); c++){
                indexes.put(docs.get(c), docNum);
            }
        }
        return indexes;
    }
}