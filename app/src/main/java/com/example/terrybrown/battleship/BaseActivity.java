package com.example.terrybrown.battleship;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by terrybrown on 5/17/16.
 */
public class BaseActivity extends AppCompatActivity {

    static final String TAG = "BATTLESHIP";


    static User user;
    static Boolean loggedIn = false;
    static Integer gameId = -1;         // Set to negative to start
    static ServerRequest sr;

    static String baseUrl = "http://battlegameserver.com";
    static String getShipsUrl = "http://battlegameserver.com/api/v1/available_ships.json";
    static String loginUrl = "http://battlegameserver.com/api/v1/login";
    static String getAllUsersUrl = "http://battlegameserver.com/api/v1/all_users.json";
    static String startGameUrl = "http://battlegameserver.com/api/v1/challenge_computer.json";
    static String addShipUrl = "http://battlegameserver.com/api/v1/";




    }