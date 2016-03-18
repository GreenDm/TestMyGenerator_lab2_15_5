package com.epam;

import java.util.*;

/**
 * Created by m18 on 18.03.2016.
 */
public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public Set<Integer> generateDistinct (){
        Set<Integer> arrInt = new HashSet<>();
Random rand1 = new Random();
        for(int i = 0; i<=numOfElm;i++){
            int randNum = rand1.nextInt(maxNumb);
            arrInt.add(randNum);
        }
        return  arrInt;

    }
    public List<Integer> generate() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= numOfElm; i++) {
            int randNum = random.nextInt(maxNumb);
            list.add(randNum);
        }
        return list;
    }
}
