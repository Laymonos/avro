package aymenzaghouani.com;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

public class Deserialize {
   public static void main(String args[]) throws IOException{
	
      //DeSerializing the objects
      DatumReader<emp> empDatumReader = new SpecificDatumReader<emp>(emp.class);
		
      //Instantiating DataFileReader
      DataFileReader<emp> dataFileReader = new DataFileReader<emp>(new
         File("D:/neo4j/Avro_Work/with_code_gen/emp.avro"), empDatumReader);
      emp em=null;
		
      while(dataFileReader.hasNext()){
      
         em=dataFileReader.next(em);
         System.out.println(em);
      }
   }
}