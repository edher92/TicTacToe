<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery-3.2.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="TicTacToeCSS.css" />
        <script type="text/javascript" src="TicTacToe.js"></script>
        <title>Welcome to Spring Web MVC project</title>

    </head>

    <div>
        <audio autoplay >
            <source src="got.mp3" type="audio/mpeg">
        </audio>
    </div>



    <body onload="restart()">


        <div id="body">
            <button id="b11" class="buttons" name="0" onclick="actions(this)"></button>
            <button id="b12" class="buttons" name="1" onclick="actions(this)"></button>
            <button id="b13" class="buttons" name="2" onclick="actions(this)"></button>
            <button id="b21" class="buttons" name="3" onclick="actions(this)"></button>
            <button id="b22" class="buttons" name="4" onclick="actions(this)"></button>
            <button id="b23" class="buttons" name="5" onclick="actions(this)"></button>
            <button id="b31" class="buttons" name="6" onclick="actions(this)"></button>
            <button id="b32" class="buttons" name="7" onclick="actions(this)"></button>
            <button id="b33" class="buttons" name="8" onclick="actions(this)"></button>
        </div>

    </body>

</html>