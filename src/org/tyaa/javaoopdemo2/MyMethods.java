/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo2;

import java.util.List;

/**
 *
 * @author Yurii
 */
public class MyMethods {
    
    public enum Direction {Direct, Reverse}
    
    public static double firstStaticMethod(double _a, double _b){
    
        return _a * _b;
    }
    
    public double firstMethod(double _a, double _b){
    
        return _a * _b;
    }
    
    //public static void sort(List _items){
    //public static void sort(List _items, MyComarator _myComparator){
    public static void sort(List _items, MyComarator _myComparator, Direction _direction){
    
        while(true){
            
            boolean comlete = true;
            for (int i = 0; i < _items.size() - 1; i++) {
            
                //if (_items.get(i + 1).toString().compareTo(_items.get(i).toString()) < 0) {
                
                /*if (_myComparator.compare(_items.get(i + 1), _items.get(i)) < 0) {

                    comlete = false;
                    Object tmpString = _items.get(i + 1);
                    _items.set(i + 1, _items.get(i));
                    _items.set(i, tmpString);
                }*/
                
                Object o1 = null;
                Object o2 = null;
                if (_direction.equals(Direction.Direct)) {
                    
                    o1 = _items.get(i + 1);
                    o2 = _items.get(i);
                } else {
                
                    o2 = _items.get(i + 1);
                    o1 = _items.get(i);
                }
                
                if (_myComparator.compare(o1, o2) < 0) {

                    comlete = false;
                    Object tmpString = _items.get(i + 1);
                    _items.set(i + 1, _items.get(i));
                    _items.set(i, tmpString);
                }
            }
            if (comlete) {
                break;
            }
        }
        
        
    }
}
