package com.company;

public class Buttonn {
    private String title;
    private onClickListener onClickListener;

    public Buttonn(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setOnClickListener(onClickListener onClickListener){
        this.onClickListener=onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface onClickListener{
        public void onClick(String title);
    }
}
