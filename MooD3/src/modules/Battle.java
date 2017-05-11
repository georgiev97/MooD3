package modules;

/**
 * Created by valentin on 11.04.17.
 */
public class Battle  {

    StringBuilder result=new StringBuilder();


    public int compare(Archangel archangel,Demon demon) {

        boolean higherLevel = archangel.getLevel() > demon.getLevel();
        int diferenceLevelPoint = archangel.getLevel()-demon.getLevel();

        boolean higherSpecialPoints = archangel.getSpecialPoints() > demon.getSpecialPoints();
        double diferenceSpecialPoints = archangel.getSpecialPoints() - demon.getSpecialPoints();

        if (higherLevel){

            if (higherSpecialPoints){

                result.append("Archangel win the fight!").
                        append("\nUsername :").
                        append(archangel.getUserName());

                result.append("\nResult:").
                        append("\n higher level point : ").
                        append(Math.abs(diferenceLevelPoint)).
                        append("\n higher special points :").
                        append(Math.abs(diferenceSpecialPoints));

                return 1 ;
            }

            if (archangel.getSpecialPoints().equals(demon.getSpecialPoints())){

                result.append("Archangel win by higher level:").
                        append("\n Username:").
                        append(archangel.getUserName());
                result.append("\nResult:").
                        append("\n higher level point : ").
                        append(Math.abs(diferenceLevelPoint)).
                        append("\n higher special points :").
                        append(Math.abs(diferenceSpecialPoints));
                return 1;
            }

            result.append("Demon win the fight").
                    append("\n Username:").
                    append(demon.getUserName());
                    result.append("\nResult:").
                    append("\n higher level point : ").
                    append(Math.abs(diferenceLevelPoint)).
                    append("\n higher special points :").
                    append(Math.abs(diferenceSpecialPoints));

            return 0;

        }

        if (higherSpecialPoints){

            result.append("Archangel win the fight by higher special points").
                    append("\nUsername :").
                    append(archangel.getUserName());
                    result.append("\nResult:").
                    append("\n higher level point : ").
                    append(Math.abs(diferenceLevelPoint)).
                    append("\n higher special points :").
                    append(Math.abs(diferenceSpecialPoints));


            return 1;
        }

        if(archangel.getSpecialPoints().equals(demon.getSpecialPoints())){

            result.append("Demon win the fight by higher level").
                    append("\nUsername :").
                    append(archangel.getUserName());
                    result.append("\nResult:").
                    append("\n higher level point : ").
                    append(Math.abs(diferenceLevelPoint)).
                    append("\n higher special points :").
                    append(Math.abs(diferenceSpecialPoints));
        }


        result.append("Demon win the fight").
                append("\n Username:").
                append(demon.getUserName());
        result.append("\nResult:").
                append("\n higher level point : ").
                append(Math.abs(diferenceLevelPoint)).
                append("\n higher special points :").
                append(Math.abs(diferenceSpecialPoints));

        return 0;
    }

    public String pritnResult(){
        return result.toString();
    }
}
