package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();

        //my code starts here:
        List<List<Integer>> docNum = new ArrayList<>();
        for(int i = 0; i < docs.size(); i++){
            List<Integer> wordNum = new ArrayList<>();
            for(int j = 0; j < docs.get(i).length(); j++){
                wordNum.add(j);
                indexes.put(docNum, docs.get(wordNum.size());
            }

        }

        return indexes;
    }
}