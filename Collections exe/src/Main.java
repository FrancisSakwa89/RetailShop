import com.company.MapInterfaceAndCollectionExe;
import com.company.MysqlCon;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        MapInterfaceAndCollectionExe exe = new MapInterfaceAndCollectionExe();
        exe.copyHashSetToArray();
        exe.treeSetSize();
        exe.hashMap();
        exe.addingSpecificIndexElementInArray();

        MysqlCon mysqlCon = new MysqlCon();
        try {
            mysqlCon.readDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
