/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg3;

import java.util.ArrayList;

/**
 *
 * @author anhnv_tt
 */
public class Sumo {

    private String name;
    private int weight;
    private ArrayList<Double> point;

    public Sumo() {
    }

    public Sumo(String name, int weight, ArrayList<Double> point) {
        this.name = name;
        this.weight = weight;
        this.point = point;
    }

    public ArrayList<Double> getPoint() {
        return point;
    }

    public void setPoint(ArrayList<Double> point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double averagePoint(ArrayList<Double> point) {
        double average;
        int count = 0;
        double sum = 0;
        for (int i = 0; i < point.size(); i++) {
            sum += point.get(i);
            count++;
        }
        return sum / count;
    }

    @Override
    public String toString() {
        return "Sumo{" + "name=" + name + ", weight=" + weight + ", point=" + point + '}';
    }

}
