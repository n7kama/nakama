
//canvas
const canvas = document.getElementById("canvas");
canvas.width = window.innerWidth -10;
canvas.height = window.innerHeight = 600;

//canvas backbround
let context = canvas.getContext("2d");
let start_background_color = "white";
context.fillStyle = start_background_color;
context.fillRect(0,0,canvas.width,canvas.height);

// color, size, boolean for drawing
let draw_color ="black";
let draw_width ="2";
let is_drawing =false;

//stores previous beginPath and endPath into an array to use the undo function
let restore_array = [];
let index = -1;

//change color
function change_color(element){
    draw_color = element.style.background;
}

//event listener for drawing, click and drag
canvas.addEventListener("touchstart", start, false);
canvas.addEventListener("touchmove", draw, false);
canvas.addEventListener("mousedown", start, false);
canvas.addEventListener("mousemove", draw, false);

//event listener to stop drawing when lift or mouse out of canvas
canvas.addEventListener("touchend", stop, false);
canvas.addEventListener("mouseup", stop, false);
canvas.addEventListener("mouseout", stop, false);

// start event for canvas
function start(event){
    is_drawing = true;
    context.beginPath();
    context.moveTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
    event.preventDefault();
}

//draw event, shape, color
function draw(event){
    if(is_drawing){
        context.lineTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
        context.strokeStyle = draw_color;
        context.lineWidth = draw_width;
        context.lineCap = "round";
        context.lineJoin = "round";
        context.stroke();
    }

}
//stop drawing event, close path
function stop(event){
    if(is_drawing){
        context.stroke();
        context.closePath();
        is_drawing = false;
    }
    event.preventDefault();

    //store index
    if(event.type != 'mouseout'){
        restore_array.push(context.getImageData(0, 0, canvas.width, canvas.height));
        index+=1;
    };
  
}
//clear canvas
function clear_canvas(){
    context.fillstyle = start_background_color;
    context.clearRect(0, 0, canvas.width, canvas.height);
    context.fillRect(0, 0, canvas.width, canvas.height);

    restore_array = [];
    index = -1;
}
//undo last index
function undo_last(){
    if(index<=0){
        clear_canvas();

    }else{
        index -= 1;
        restore_array.pop();
        context.putImageData(restore_array[index],0 , 0);
    }
}