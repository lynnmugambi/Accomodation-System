/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

/**
 *
 * @author Mwendwa Mugambi
 */

//decorator class
public class MeterDecorator implements Meter{
    private Meter privatemeterref = null;

    public MeterDecorator(Meter meterref ) {
        this.privatemeterref = meterref;
    }   

    @Override
    public void addMeter(int num,String name, String type) {
        privatemeterref.addMeter(num,name,type);
    }
    
}
