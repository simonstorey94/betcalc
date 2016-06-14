package malone.service.impl;

import malone.service.BetService;
import org.springframework.stereotype.Component;
import java.util.Scanner;

/**
 * Created by mct on 10/06/16.
 */
@Component
public class BasicBetService implements BetService {
    Scanner input = new Scanner(System.in);
    @Override
    public String calculateBet(int oddsPart1, int oddsPart2, int stake) {
        return "Your bet profit is: " + calculateProfit(oddsPart1, oddsPart2, stake);
    }


    private double calculateProfit(int oddsPart1, int oddsPart2, int stake) {
        double calculateProfit = (stake * oddsPart1 / oddsPart2) + stake;
        return calculateProfit;
    }
}
