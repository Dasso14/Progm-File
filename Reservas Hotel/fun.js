var rs = document.getElementById('reservationResult');
var gn = document.getElementById('guestName');

var availability = getRandomNumber();

var hotelNames = [
		'Hotel Birmingham',
		'Embassy Suite',
		'Days Inn'
	]

	for(i=0; i < hotelNames.length; i++){
		document.getElementById('hotelNames').innerHTML += "<option value='" + hotelNames[i] + "'>" + hotelNames[i] +"</option>";
	}

rs.setAttribute("class", "hide");

document.getElementById('hotelChosen').innerHTML = hotelNames[0];
document.getElementById('displayRooms').innerHTML = availability;

function getFirstName(){
  var firstName =  document.getElementById('firstName').value;
  
  if(firstName != ''){
    rs.setAttribute('class', 'col-12');
    return firstName;
  }else{
    return "Valued";
  }
  
}

function getLastName(){
  var lastName =  document.getElementById('lastName').value;
  
  if(lastName != ''){
    rs.setAttribute('class', 'col-12');
    return lastName;
  }else{
    return "Guest";
  }
  
}

function getHotelName(){
  var hotelName =  document.getElementById('hotelNames').value;
  return hotelName;
}

function getNumberOfRooms(){
  var numberOfRooms = document.getElementById('numberOfRooms').value;
  Number(numberOfRooms);
  
  if(numberOfRooms > 0){
    gn.setAttribute('class', 'col-12');
    return availability - numberOfRooms;
  }else{
    
    rs.setAttribute('class', 'hide');
    return "Enter Number of Rooms";
  }
  
}

function displayValues(){
  document.getElementById('guestName').innerHTML = getFirstName() + " " + getLastName();
  document.getElementById('hotelChosen').innerHTML = getHotelName();
  document.getElementById('displayRooms').innerHTML = getNumberOfRooms();
}

function getRandomNumber(){
  var availability = Math.floor(Math.random() * (200 - 0)) + 1;
  return availability;
}