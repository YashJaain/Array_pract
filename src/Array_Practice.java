import java.util.*;
import java.io.*;



public class Array_Practice {

        public static void printArray(int[] arr)
        {
            for(int a = 0; a < arr.length; a++)
            {
                System.out.println(arr[a]);
            }
        }

        public static int[] addarray(int[] arr , int position, int value) {
            int[] brr = new int[arr.length+1];
            for(int i = 0; i < position ; i++)
            {
                brr[i] = arr[i];
            }
            brr[position] = value;
            for(int j = position; j < arr.length; j++)
            {
                brr[j + 1] = arr[j];
            }
            return brr;
        }

        public static int[] removearray(int[] arr , int position) {
            int[] crr = new int[arr.length-1];
            int j = 0;
            for(int i = 0; i < arr.length ; i++)
            {
                if(i == position) {
                    continue;
                }
                else {
                    crr[j] = arr[i];
                    j++;
                }
            }
            return crr;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter how many numbers you want to add:- ");
            int i = sc.nextInt();
            int arr[] = new int[i];
            for(int x=0; x<i;x++)
            {
                System.out.print("Enter digit:- ");
                int j = sc.nextInt();
                arr[x] = j;
            }
            System.out.print("Enter position at you want to add:- ");
            int position = sc.nextInt();
            System.out.print("Enter value you want to add:- ");
            int value = sc.nextInt();
            int zrr[] = addarray(arr,position-1,value);
            printArray(zrr);
            System.out.print("Enter position you want to remove:- ");
            position = sc.nextInt();
            printArray(removearray(zrr,position-1));




        }

    }

