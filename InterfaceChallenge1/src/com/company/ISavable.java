package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {
    List<String> write(); //runtime pe bind hoga actual class ke function se
    // ...compile time pe interface ke methods pe(so u cannot access methods of pointing object by this interface as
    // at compile time only these methods are visible but u can cast ro see obj methods)
    //i.e   Isavable x=any implementing class Obj
    //x.(methods of interface only)
    //((obj class name)x).(objects methods+interface implemented method);
    void read(List<String> savedValues);
}
