package com.example.circuitway;

import java.util.ArrayList;

public final class DetailLine {
    public ArrayList<Detail> Details;
    public float Resistance;
    public float Voltage;

    public void OnCircuitStart()
    {
        for (Detail v: Details)
        {
            Resistance += v.Resistance;
            v.Line = this;
        }
    }
}
