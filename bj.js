function shuffleArray(inputArray){
    inputArray.sort(()=> Math.random() - 0.5);
}

function init(){
    initGameValues();
}

function initGameValues(){
    const deck = [];
    for (i = 0;i <52;i++){
        deck[i] = i;
    }
    shuffleArray(deck);
    console.log(deck);
    game.deck = deck;
    game.count = 0;
    game.player_count = 0;
    game.banker_count = 0;
    game.player_points = 0;
    game.banker_points = 0; 
}

function Onclick(){
    const parent = document.getElementById("player_desk");
    const point = game.deck[game.count];
    const pointmapping = [1,2,3,4,5,6,7,8,9,10,0.5,0.5,0.5];
    game.count += 1;
    game.player_count += 1;

    
    game.player_points += pointmapping[point%13];
    player_think();

    
    parent.appendChild(GetCardUI(point));
 }

 function GetCardUI(point){
    const numbermapping = ["A","2","3","4","5","6","7","8","9","10","J","Q","K"]; 
    const flowermapping = ["spade.png","heart.jpeg","diamond.png","club.png"];
    
    const card = document.createElement("div");
    const upborder = document.createElement("div");
    const upflower = document.createElement("img");
    const downborder = document.createElement("div");
    const downflower = document.createElement("img");
    const number = document.createElement("div");
    
    upborder.setAttribute("class","upborder");
    downborder.setAttribute("class","downborder");
    card.setAttribute("class","card");

    upflower.setAttribute("class","flower" );
    upflower.setAttribute("src","img/heart.jpeg")
    downflower.setAttribute("class","flower");    
    downflower.setAttribute("src","img/heart.jpeg")

    
    number.setAttribute("class","number");
    number.innerText=numbermapping[point%13];
    upflower.setAttribute("src","img/"+flowermapping[Math.floor(point/13)]);
    downflower.setAttribute("src","img/"+flowermapping[Math.floor(point/13)]);


    card.appendChild(upborder);
    card.appendChild(number);
    card.appendChild(downborder);
    upborder.appendChild(upflower);
    downborder.appendChild(downflower);
    return card;
}

function player_think() {
    if(game.player_points>10.5){
        document.getElementById("information").innerHTML = "????????????,";
        document.getElementById("information").innerHTML += "?????????"+game.player_points;
    } else if (game.player_points == 10.5 || game.count == 5) {
        document.getElementById("information").innerHTML = "????????????,";
        document.getElementById("information").innerHTML += "?????????"+game.player_points;

    } else{
        document.getElementById("information").innerHTML = "???????????????"+game.player_points;
    }

}

function Finsh(){
    const parent = document.getElementById("banker_desk");
    const point = game.deck[game.count];
    const pointmapping = [1,2,3,4,5,6,7,8,9,10,0.5,0.5,0.5];
    game.count += 1;
    game.banker_count += 1;

    
    game.banker_points += pointmapping[point%13];
    banker_think();

    
    parent.appendChild(GetCardUI(point));
}

function banker_think() {
    if(game.banker_points>10.5){
        document.getElementById("information").innerHTML = "????????????,";
        document.getElementById("information").innerHTML += "?????????"+game.banker_points;
    } else if (game.banker_points == 10.5 || game.banker_count == 5) {
        document.getElementById("information").innerHTML = "????????????,";
        document.getElementById("information").innerHTML += "?????????"+game.banker_points;

    } else{
        document.getElementById("information").innerHTML = "???????????????"+game.banker_points;
    }

}

window.game = {}
init();