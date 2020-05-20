import java.io.*;
public class Main {
    public static void main(String[] args) {
        String csvFile = "demo.csv";
        String line;
        String csvSplit =",";
        try{
            BufferedReader br =new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine())!=null){
                String[] country = line.split(csvSplit);
                System.out.println("Country [code="+country[4]+",name= "+country[5]+"]");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
