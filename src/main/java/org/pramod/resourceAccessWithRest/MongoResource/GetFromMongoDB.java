package org.pramod.resourceAccessWithRest.MongoResource;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
public class GetFromMongoDB {
    public static StringBuilder getResource(int id) {
        StringBuilder str=new StringBuilder("");
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db=mongo.getDB("test");
            DBCollection collection=db.getCollection("address");
            DBCursor dbCursor=collection.find();
            int count=0;
            while(dbCursor.hasNext()){
                if(count==id) {
                    str.append(dbCursor.next().toString());
                    break;
                }
                count++;
                dbCursor.next();
                }
             mongo.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}


