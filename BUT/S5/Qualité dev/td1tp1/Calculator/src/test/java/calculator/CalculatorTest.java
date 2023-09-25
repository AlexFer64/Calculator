package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions;

class CalculatorTest {
    @Test
    void add_additionne_int_positifs(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 2;
        int opD = 3;

        //When
        result = calcul.add(opG, opD);

        //Then
        assertThat(result).isEqualTo(5);
    }

  @Test
    void add_additionne_int_positif_negatif(){
      // Given
      Calculator calcul = new Calculator();
      int result;
      int opG = 2;
      int opD = -3;

      //When
      result = calcul.add(opG, opD);

      //Then
      assertThat(result).isEqualTo(-1);
  }

  @Test
    void add_additionne_int_negatifs(){
      // Given
      Calculator calcul = new Calculator();
      int result;
      int opG = -2;
      int opD = -3;

      //When
      result = calcul.add(opG, opD);

      //Then
      assertThat(result).isEqualTo(-5);
    }

    @Test
    void add_additionne_int_positif_null(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 2;
        int opD = 0;

        //When
        result = calcul.add(opG, opD);

        //Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void add_additionne_int_nulls(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 0;
        int opD = 0;

        //When
        result = calcul.add(opG, opD);

        //Then
        assertThat(result).isEqualTo(0);
    }

    @Test
    void add_additionne_large_int(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 50000000;
        int opD = 50000000;

        //When
        result = calcul.add(opG, opD);

        //Then
        assertThat(result).isEqualTo(100000000);
    }

    @Test
    void divide_divise_int_positifs(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 4;
        int opD = 2;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void divide_divise_int_positif_negatif(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 4;
        int opD = -2;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(-2);
    }

    @Test
    void divide_divise_int_negatifs(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = -4;
        int opD = -2;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void divide_divise_int_positif_null(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 4;
        int opD = 0;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(null);
    }

    @Test
    void divide_divise_int_nulls(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 0;
        int opD = 0;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(0);
    }

    @Test
    void divide_divise_large_int(){
        // Given
        Calculator calcul = new Calculator();
        int result;
        int opG = 40000000;
        int opD = 20000000;

        //When
        result = calcul.divide(opG, opD);

        //Then
        assertThat(result).isEqualTo(2);
    }
}