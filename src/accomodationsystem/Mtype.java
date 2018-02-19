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
//concrete class for meter type state
public class Mtype implements TypeSwitch{
    
    private TypeSwitch state;

   
    public TypeSwitch getState() {
        return state;
    }

    public void setState(TypeSwitch state) {
        this.state = state;
    }
    @Override
    public void switchtype(int meternum){
        this.state.switchtype(meternum);
    }
    
}
