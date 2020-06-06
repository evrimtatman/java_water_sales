package util;

import java.sql.DriverManager;

public class DB {
    
        public SQLiteDb() {
        try{
            //Connection
            conn=DriverManager.getConnection(path);
            
            System.out.println("Connect Succeed");
            
        }catch(Exception e){
        System.err.println("Conn err: " + e);
        }
    }
    
}
