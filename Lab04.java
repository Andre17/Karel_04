/**
*
* Description of the program goes here  // provide a brief description
*
* @author <André Purits>  // replace <...> with your name
* @version <03/11.14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

public static void takeTheField(Athlete arg)
{
   arg.move();
   arg.move();
   arg.move();
   arg.move();
   arg.turnRight();
   arg.move();
   arg.move();
}
     public static void main(String[] args) {
          Display.openWorld("maps/arena.map");
     Display.setSize(10, 10);
     Display.setSpeed(3);
      Athlete andre = new Athlete();
      Athlete giroud = new Athlete();
      Athlete zlatan = new Athlete();
      Athlete thierry = new Athlete();
      Athlete olivier = new Athlete();
      Athlete ibrahimovic = new Athlete();
      takeTheField(andre);
      takeTheField(giroud);
      takeTheField(zlatan);
      takeTheField(thierry);
      takeTheField(olivier);
      takeTheField(ibrahimovic);
      andre.move();
      andre.turnLeft();
      andre.move();
      andre.turnAround();
      zlatan.move();
      zlatan.move();
      zlatan.move();
      zlatan.turnLeft();
      zlatan.move();
      zlatan.move();
      zlatan.turnAround();
      giroud.move();
      giroud.move();
      giroud.move();
      giroud.move();
      giroud.move();
      giroud.turnLeft();
      giroud.move();
      giroud.turnAround();
      thierry.move();
      thierry.move();
      thierry.move();
      thierry.move();
      thierry.turnRight();
      olivier.move();
      olivier.move();
      olivier.move();
      olivier.turnRight();
      ibrahimovic.move();
      ibrahimovic.move();
      ibrahimovic.turnRight();
      Athlete coach = new Athlete(2, 7, Display.EAST, 0);

     }
}
