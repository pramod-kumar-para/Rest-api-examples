package org.pramod.resourceAccessWithRest.MongoResource;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Created by Pramodh on 15-11-2015.
 */
public class UserProfiles {
    public static String authenticateProfile(String Username,String Password){
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db=mongo.getDB("EventTracker");
            DBCollection collection=db.getCollection("userProfiles");
            DBCursor cursor=collection.find();
            while(cursor.hasNext()) {
                System.out.print(cursor.next());
            }
        }catch(Exception e){
            return "Problem connecting to db";
        }
        return "";
    }
    public static void main(String... args) {
        UserProfiles.authenticateProfile("","");
        System.out.println("hello");
    }

}
