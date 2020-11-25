package com.example.CabAggregator.strategies;

import com.example.CabAggregator.models.Cab;
import com.example.CabAggregator.models.Location;
import com.example.CabAggregator.models.Rider;

import java.util.List;

public interface CabMatchingStrategy {
    Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
