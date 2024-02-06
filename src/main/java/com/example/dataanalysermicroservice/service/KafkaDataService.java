package com.example.dataanalysermicroservice.service;

import com.example.dataanalysermicroservice.entity.Data;

public interface KafkaDataService {
    void handle(Data data);
}
