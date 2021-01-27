package cloudControl.Pages;

import org.openqa.selenium.By;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExecutionPage extends WebDriverManager {
    String allstring;
    static int column_number;

    public void selectServer(String str) {
        allstring = str;
        for (int i = 2; i < 7; i++) {
            if (driver.findElement(By.xpath("//tr//th[" + i + "]")).getText().equals(str)) ;
            {
                column_number = i;
                break;
            }
        }
    }

    public void checkNullIp() throws IOException {
     /*  Date date=new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("_dd/MM/yyyy hh:mm");
        String strDate = formatter.format(date);
        System.out.println(strDate);
       StringBuilder fileName = new StringBuilder(allstring);

       fileName.append(strDate);
        System.out.println(fileName);
File f= new File("/Users/ashrafahamed/Download/Ashfaq1.txt");
if(!f.exists()){
    try{FileWriter fw=new FileWriter(f,true);
        BufferedWriter writer=new BufferedWriter(fw);*/
        Date objDate = new Date(); // Current System Date and time is assigned to objDate
        System.out.println(objDate);
        String strDateFormat = "dd MMM yyyy hh:mm"; //Date format is Specified
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
        String obj = objSDF.format(objDate);
        System.out.println(obj);
        String filename = allstring + obj;
        FileWriter writer = new FileWriter("/Users/ashrafahamed/Downloads/" + filename + ".txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (int i = 1; i < 335; ++i) {

            // js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//tr["+i+"]//td["+column_number+"]")));
            if (driver.findElement(By.xpath("//tr[" + i + "]//td[" + column_number + "]")).getText().equals("")) {
                //System.out.println(driver.findElement(By.xpath("//tr["+i+"]//td[1]")).getText());
                bufferedWriter.write(driver.findElement(By.xpath("//tr[" + i + "]//td[1]")).getText());
                bufferedWriter.newLine();

            }
        }
        bufferedWriter.close();
    }
}
