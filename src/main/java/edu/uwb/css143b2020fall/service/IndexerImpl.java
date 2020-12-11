package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();

        //my code starts here:
        List<List<Integer>> docNum = new ArrayList<>();
        List<Integer> wordNum = new ArrayList<>();
        for(int i = 0; i < docs.size(); i++){
            docNum.add(i);
            for(int j = 0; j < docs.get(i).length(); j++){
                wordNum.add(j);
            }

        for(int a = 0; a < docNum.size(); a++){
            for(int b  = 0; b < wordNum.size(); b++){
                indexes.put(docs.get(b), docNum);
            }
        }
        return indexes;
    }
}