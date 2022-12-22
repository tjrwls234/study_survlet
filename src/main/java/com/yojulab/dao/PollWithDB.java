package com.yojulab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PollWithDB {
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException {
        // SELECT * FROM QUESTIONS_LIST
        // WHERE QUESTIONS_UID = 'Q2';
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "SELECT * FROM QUESTIONS_LIST " +
                "WHERE QUESTIONS_UID = '" + questionsUid + "'";

        ResultSet resultSet = statement.executeQuery(query);
        HashMap<String, Object> result;
        while (resultSet.next()) {
            result = new HashMap<>();
            result.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
            result.put("QUESTIONS", resultSet.getString("QUESTIONS"));
            result.put("QRDERS", resultSet.getString("QRDERS"));
        }
        return result;
    }
}
