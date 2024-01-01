package com.example._static;

import java.util.HashMap;
import java.util.Map;

public final class LocationImmutable {
    private final int locationId;
    private  final String description;
    private  final Map<String,Integer> exists;

    public LocationImmutable(int locationId, String description,Map<String,Integer> exists){
        this.locationId=locationId;
        this.description=description;
//        this.exists=exists;
        if(exists!=null)
        this.exists=new HashMap<>(exists);
        else
            this.exists=new HashMap<>(); //if ref is null
        this.exists.put("Q",0);
    }
    public int getLocationId(){
        return locationId;
    }
    public String getDescription(){
        return description;
    }
    public Map<String,Integer> getExists(){
        return new HashMap<String,Integer>(exists);
//        return exists;
    }
}
