
var con = 1;
var b1 = "0", b2 = "1", b3 = "2", b4 = "3", b5 = "4", b6 = "5", b7 = "6", b8 = "7", b9 = "8";


function restart(){
    $.post("http://localhost:8080/Gato/control/reiniciar.htm", function (data) {           
        });
    
}
function actions(boton) {

    if (boton.className == "buttons") {
        $.post("http://localhost:8080/Gato/control/movida.htm", {
            casilla: boton.name,
        }, function (datas) {
            var str = datas.toString();
            var array = str.split(",");
           // var data=array[0];
            //var dato = array[1];
            console.log("data is: "+array[0]);
            var button = document.getElementsByName(array[0])[0];



            if (array[1] == "9") {
                window.alert("you win");
            } else
            if (array[1] == "10") {
                window.alert("you lose");
            } 
               
                var text = "O";
                button.value = text;
//  alert(boton.value);
                button.appendChild(document.createTextNode(text));
                button.className = "clicked";
            
        });
        boton.className = "clicked";
        var text = "X";
        boton.value = text;
        boton.appendChild(document.createTextNode(text));

}
}






/*
 function actions(boton){
 $.post("http://localhost:8080/Gato/control/movida.htm", {
 casilla: boton.name,       
 }, function (data) {
 
 
 
 
 
 
 })
 
 
 
 
 
 
 
 
 
 
 
 if(boton.className=="buttons"){
 //  alert(boton.name);
 boton.className="clicked";
 var text;
 if(con%2==0){
 text="X";
 }else{
 text="O";
 }
 boton.value=text;
 //  alert(boton.value);
 boton.appendChild(document.createTextNode(text));
 con++;
 asignation(text,boton);
 }else{
 //  alert("Yei!!!");
 //  alert(boton.value);
 }
 }
 function asignation(text,boton){
 if(b1==boton.name){
 b1=text;
 }
 else if(b2==boton.name){
 b2=text;
 }
 else if(b3==boton.name){
 b3=text;
 }
 else if(b4==boton.name){
 b4=text;
 }
 else if(b5==boton.name){
 b5=text;
 }
 else if(b6==boton.name){
 b6=text;
 }
 else if(b7==boton.name){
 b7=text;
 }
 else if(b8==boton.name){
 b8=text;
 }
 else if(b9==boton.name){
 b9=text;
 }
 validation(text);
 }
 function validation(text){
 if((b1==b2 && b2==b3)||(b1==b5 && b5==b9)||(b3==b5 && b5==b7)||(b4==b5 && b5==b6)||(b7==b8 && b8==b9)||(b1==b4 && b4==b7)||(b2==b5 && b5==b8)||(b3==b6 && b6==b9)){
 var con=confirm(text+" has won!!!\nDo you wanna play again?");
 if(con==true){
 window.location.reload();
 }
 }
 }
 
 
 
 */