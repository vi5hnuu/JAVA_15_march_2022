package com.company;

public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        if(width<=0.0 || height<=0.0 || areaPerBucket<=0.0 || extraBucket<0)
            return -1;
        else{
            double area=width*height;
            double remainingArea=area-extraBucket*areaPerBucket;
            int bucketRequired=0;
            while(bucketRequired*areaPerBucket<remainingArea)
                bucketRequired++;
            return bucketRequired;

        }

    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0)
            return -1;
        else
            return getBucketCount(width,height,areaPerBucket,0);

    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0)
            return -1;
        else{
            int requiredBucket=0;
            while (requiredBucket*areaPerBucket<area)
                requiredBucket++;
            return requiredBucket;
        }

    }

    }
