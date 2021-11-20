public class StarPattern11 {
    public static void main(String[] args){
        int i,j,k =0;
        for (i = 1; i <= 9; i++) {
            var result = i <= 5 ? k++ : k --;
            for ( j = 1; j <= 9; j++) {
                if (j <= 6 - k || j >= 4 + k) {
                    System.out.print("*");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}
//********
//*******
//******
//****
//***
//**
//***
//****
//*****
//******
//*******