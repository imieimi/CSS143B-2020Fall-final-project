package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SearcherImpl implements Searcher {
    public List<Integer> search(String keyPhrase, Map<String, List<List<Integer>>> index) {
        List<Integer> result = new ArrayList<>();
        // add your code
        for(int i = 0; i < index.size(); i++){
            for(int j = 0; j < index.get(i).size(); j++){
                String current = index.get(i).toString();
                if(keyPhrase == current){
                    result.add(j);
                }
            }
        }
        return result;
    }
}