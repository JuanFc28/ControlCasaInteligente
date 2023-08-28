

import java.util.Scanner;

public class RemoteLoader {
 
	public static void main(String[] args) {
		CommandsStack commandStack = new CommandsStack();
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		Television tv = new Television("Living room");
		PlayStation ps5 = new PlayStation("Game room");
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);

		TelevisionOnCommand televisionOnCommand = 
				new TelevisionOnCommand(tv);
		TelevisionOffCommand televisionOffCommand =
				new TelevisionOffCommand(tv);

		PlayStationOnCommand playStationOnCommand =
				new PlayStationOnCommand(ps5);
		PlayStationOffCommand playStationOffCommand =
				new PlayStationOffCommand(ps5);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(5, televisionOnCommand, televisionOffCommand);
		remoteControl.setCommand(6, playStationOnCommand, playStationOffCommand);
 
		System.out.println("\n------ Remote Control -------");
		System.out.println("[0] Living room light \n[1] Kitchen light \n[2] Ceiling fan"+
		"\n[3] Stereo \n[4] Garage door \n[5] Television \n[6] Play Station \n[7] UNDO \n[8] Exit");
		
		do{
			int opcion;
			int onOff;
			System.out.println("\nPress a button: ");
			Scanner entrada = new Scanner(System.in);
			Scanner interruptor = new Scanner(System.in);
            opcion = entrada.nextInt();

			switch(opcion){
				
				case 0:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(0);
						commandStack.push(remoteControl.onCommands[0]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(0);
						commandStack.push(remoteControl.offCommands[0]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 1:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(1);
						commandStack.push(remoteControl.onCommands[1]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(1);
						commandStack.push(remoteControl.offCommands[1]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 2:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(2);
						commandStack.push(remoteControl.onCommands[2]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(2);
						commandStack.push(remoteControl.offCommands[2]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 3:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(3);
						commandStack.push(remoteControl.onCommands[3]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(3);
						commandStack.push(remoteControl.offCommands[3]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 4:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(4);
						commandStack.push(remoteControl.onCommands[4]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(4);
						commandStack.push(remoteControl.offCommands[4]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 5:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(5);
						commandStack.push(remoteControl.onCommands[5]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(5);
						commandStack.push(remoteControl.offCommands[5]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 6:{
					System.out.println("On(1) ||||| Off(2)");
					onOff = entrada.nextInt();
					if(onOff == 1){
						remoteControl.onButtonWasPushed(6);
						commandStack.push(remoteControl.onCommands[6]);
						System.out.println(commandStack);
					}
					else{
						remoteControl.offButtonWasPushed(6);
						commandStack.push(remoteControl.offCommands[6]);
						System.out.println(commandStack);
					}
					if(commandStack.isFull()){
						System.out.println("The stack is full!");
					}
					break;
				}
				case 7:{
					if(commandStack.isEmpty()){
						System.out.println("The Stack is empty!");
					}
					else{
						commandStack.pop().undo();
						System.out.println(commandStack);
					}
					break;
				}
				case 8:{
					entrada.close();
					interruptor.close();
                    System.exit(0);
				}
				
			}
		}
		while(true);
	}
}
