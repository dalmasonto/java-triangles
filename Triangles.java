
package assignment;

import java.util.Scanner;

public class Triangles {
    
    static Scanner getData = new Scanner(System.in);
    
    public static void makeTrianglePatternA(){
     
        System.out.println("Pattern A");
        System.out.print("Enter size of triangle: \t");
        int size = getData.nextInt();
        for(int a = 1; a <=size; a++){
            for(int b = 1; b <= a; b++){
                System.out.print(" " + b + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
    }
    
    public static void makeTrianglePatternB(){
        
        System.out.println("Pattern B");
        System.out.print("Enter size of triangle: \t");
        int size = getData.nextInt();
        for(int a = size; a >= 1; a--){
            for(int b = 1; b <=a; b++){
                System.out.print(" " + b + " ");
            }
            System.out.println();
        }
    }
    
    public static void makeTrianglePatternC(){
        System.out.println("Pattern C");
        System.out.print("Enter size of triangle: \t");
        int size = getData.nextInt();
        for(int a = 1; a <= size; a++){ // First loop
            for(int b = a; b <= a; b++){ // Second loop
                int left_spaces = size - a;
                
                for(int ls = 1; ls <=left_spaces; ls++){
                    System.out.print(" " + " " + " ");
                }
                for(int c = b; c >= 1; c--){
                    if(c >= 10){
                        System.out.print(c + " ");
                    }
                    else{
                        System.out.print(" " + c + " ");
                    }
                }  
            }        
            System.out.println();
        } // First loop ends here
    }
    
    public static void makeTrianglePatternD(){
        System.out.println("Pattern D");
        System.out.print("Enter size of triangle: \t");
        int size = getData.nextInt();
        for(int a = size; a >=1; a--){
            
            for(int b = a; b <= a; b++){
                int left_spaces = size - a;
                
                for(int ls = 1; ls <=left_spaces; ls++){
                    System.out.print(" " + " " + " ");
                }
                
                for(int c = b; c>= 1 ; c--){
                    if(c >= 10){
                        System.out.print(c + " ");
                    }
                    else{
                        System.out.print(" " + c + " ");
                    }
                }  
            }
            
            System.out.println();
        }
        
    }
    
    public static void makeTrianglePyramid(){
        System.out.println("Pyramid");
        System.out.print("Enter size of triangle: \t");
        int size = getData.nextInt();
        for(int a = 1; a <=size; a++){
            
            for(int b = a; b<=a; b++){
                int left_spaces = size - a;
                
                for (int ls = 1; ls <= left_spaces; ls++){
                    System.out.print(" " + " " + " ");
                }
                
                for(int c = b; c >=1; c--){
                    if(c >= 10){
                        System.out.print(c + " ");
                    }
                    else{
                        System.out.print(" " + c + " ");
                    }
                }
                
                for(int d = 2; d <= a; d++){
                    System.out.print(" " + d + " ");
                }
                
                
            }
            
            
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        makeTrianglePatternA();
        makeTrianglePatternB();
        makeTrianglePatternC();
        makeTrianglePatternD();
        makeTrianglePyramid();
    }
}
