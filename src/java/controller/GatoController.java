/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sergiojc
 */
@RestController
@RequestMapping("/control")
//@RequestMapping("/trucos")
public class GatoController {

    private static int[] casillas = new int[9];

    private boolean valida(int v) {
        
        if (casillas[0] == v && casillas[1] == v && casillas[2] == v) {
            return true;
        }
        if (casillas[3] == v && casillas[4] == v && casillas[5] == v) {
            return true;
        }
        if (casillas[6] == v && casillas[7] == v && casillas[8] == v) {
            return true;
        }
        if (casillas[0] == v && casillas[3] == v && casillas[6] == v) {
            return true;
        }
        if (casillas[1] == v && casillas[4] == v && casillas[7] == v) {
            return true;
        }
        if (casillas[2] == v && casillas[5] == v && casillas[8] == v) {
            return true;
        }
        if (casillas[0] == v && casillas[4] == v && casillas[8] == v) {
            return true;
        }
        if (casillas[6] == v && casillas[2] == v && casillas[4] == v) {
            return true;
        }
        return false;
    }

    //http://localhost:8080/spring212/trucos/diHola.htm
    @RequestMapping(value = "movida", method = RequestMethod.POST, produces = "aplication/text")
    public @ResponseBody
    String movida(@RequestParam("casilla") String casilla) {
        casillas[Integer.parseInt(casilla)] = 1;
        boolean gU = valida(1);
        if (gU == true) {
            return "9";
        }

        if ((casillas[0]) == 1 && (casillas[1] == 1)) {
            if (casillas[2] == 0) {
                casillas[2] = 2;
                if (valida(2) == true) {
                    return "2,10";
                }
                return "2";
            }
        }
        if ((casillas[0]) == 1 && (casillas[2] == 1)) {
            if (casillas[1] == 0) {
                casillas[1] = 2;
                if (valida(2) == true) {
                    return "1,10";
                }
                return "1";
            }
        }
        if ((casillas[1]) == 1 && (casillas[2] == 1)) {
            if (casillas[2] == 0) {
                casillas[2] = 2;
                if (valida(2) == true) {
                    return "2,10";
                }
                return "2";
            }
           // casillas[0]=2;

        }
        if ((casillas[3]) == 1 && (casillas[4] == 1)) {
            if (casillas[5] == 0) {
                casillas[5] = 2;
                if (valida(2) == true) {
                    return "5,10";
                }
                return "5";
            }

        }
        if ((casillas[4]) == 1 && (casillas[5] == 1)) {
            if (casillas[3] == 0) {
                casillas[3] = 2;
                if (valida(2) == true) {
                    return "3,10";
                }
                return "3";
            }

        }
        if ((casillas[3]) == 1 && (casillas[5] == 1)) {
            if (casillas[4] == 0) {
                casillas[4] = 2;
                if (valida(2) == true) {
                    return "4,10";
                }
                return "4";
            }
           // casillas[4]=2;

        }
        if ((casillas[6]) == 1 && (casillas[7] == 1)) {
            if (casillas[8] == 0) {
                casillas[8] = 2;
                if (valida(2) == true) {
                    return "8,10";
                }
                return "8";
            }
           // casillas[8]=2;

        }
        if ((casillas[7]) == 1 && (casillas[8] == 1)) {
            if (casillas[6] == 0) {
                casillas[6] = 2;
                if (valida(2) == true) {
                    return "6,10";
                }
                return "6";
            }
           // casillas[6]=2;

        }
        if ((casillas[6]) == 1 && (casillas[8] == 1)) {
            if (casillas[7] == 0) {
                casillas[7] = 2;
                if (valida(2) == true) {
                    return "7,10";
                }
                return "7";
            }
            //casillas[7]=2;

        }
        if ((casillas[0]) == 1 && (casillas[4] == 1)) {
            if (casillas[8] == 0) {
                casillas[8] = 2;
                if (valida(2) == true) {
                    return "8,10";
                }
                return "8";
            }
            //casillas[8]=2;

        }
        if ((casillas[4]) == 1 && (casillas[8] == 1)) {
            if (casillas[0] == 0) {
                casillas[0] = 2;
                if (valida(2) == true) {
                    return "0,10";
                }
                return "0";
            }
            //casillas[0]=2;

        }
        if ((casillas[0]) == 1 && (casillas[8] == 1)) {
            if (casillas[4] == 0) {
                casillas[4] = 2;
                if (valida(2) == true) {
                    return "4,10";
                }
                return "4";
            }
            //casillas[4]=2;

        }
        if ((casillas[0]) == 1 && (casillas[3] == 1)) {
            if (casillas[6] == 0) {
                casillas[6] = 2;
                if (valida(2) == true) {
                    return "6,10";
                }
                return "6";
            }
            //casillas[6]=2;

        }
        if ((casillas[0]) == 1 && (casillas[6] == 1)) {
            if (casillas[3] == 0) {
                casillas[3] = 2;
                if (valida(2) == true) {
                    return "3,10";
                }
                return "3";
            }
           // casillas[3]=2;

        }
        if ((casillas[3]) == 1 && (casillas[6] == 1)) {
            if (casillas[0] == 0) {
                casillas[0] = 2;
                if (valida(2) == true) {
                    return "0,10";
                }
                return "0";
            }
            //casillas[0]=2;

        }
        if ((casillas[1]) == 1 && (casillas[4] == 1)) {
            if (casillas[7] == 0) {
                casillas[7] = 2;
                if (valida(2) == true) {
                    return "7,10";
                }
                return "7";
            }
           //casillas[7]=2;

        }
        if ((casillas[1]) == 1 && (casillas[7] == 1)) {
            if (casillas[4] == 0) {
                casillas[4] = 2;
                if (valida(2) == true) {
                    return "4,10";
                }
                return "4";
            }
            //casillas[4]=2;

        }
        if ((casillas[4]) == 1 && (casillas[7] == 1)) {
            if (casillas[1] == 0) {
                casillas[1] = 2;
                if (valida(2) == true) {
                    return "1,10";
                }
                return "1";
            }
            //casillas[1]=2;

        }
        if ((casillas[2]) == 1 && (casillas[5] == 1)) {
            if (casillas[8] == 0) {
                casillas[8] = 2;
                if (valida(2) == true) {
                    return "8,10";
                }
                return "8";
            }
            //casillas[8]=2;

        }
        if ((casillas[2]) == 1 && (casillas[8] == 1)) {
            if (casillas[5] == 0) {
                casillas[5] = 2;
                if (valida(2) == true) {
                    return "5,10";
                }
                return "5";
            }
           // casillas[5]=2;

        }
        if ((casillas[8]) == 1 && (casillas[5] == 1)) {
            if (casillas[2] == 0) {
                casillas[2] = 2;
                if (valida(2) == true) {
                    return "2,10";
                }
                return "2";
            }
            //casillas[2]=2;

        }
        if ((casillas[6]) == 1 && (casillas[4] == 1)) {
            if (casillas[2] == 0) {
                casillas[2] = 2;
                if (valida(2) == true) {
                    return "2,10";
                }
                return "2";
            }
            //casillas[2]=2;

        }
        if ((casillas[6]) == 1 && (casillas[2] == 1)) {
            if (casillas[4] == 0) {
                casillas[4] = 2;
                if (valida(2) == true) {
                    return "4,10";
                }
                return "4";
            }
            //casillas[4]=2;        
        }

        for (int i = 0; i < 9; i++) {
            if (casillas[i] == 0) {
                casillas[i] = 2;
                if (valida(2) == true) {
                    return "10";
                }
                return String.valueOf(i);
                

            }
        }

        return "";
    }

    //http://localhost:8080/spring212/trucos/diHola.htm

    @RequestMapping(value = "reiniciar", method = RequestMethod.POST, produces = "aplication/json")
    public @ResponseBody
    String reiniciar() {
        Arrays.fill(casillas, 0);
        return "";
    }

}
