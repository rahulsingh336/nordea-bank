package dummy;

import com.example.thirdparty.service.dto.Amount;
import com.example.thirdparty.service.dto.Statement;
import com.example.thirdparty.service.dto.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("generating json sample....");
        Amount amount = new Amount();
        amount.setAmount("336");
        amount.setCurrency("INR");
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setCreditDebitIndicator("CREDIT");
        transaction.setCreditDebitDate("2022-10-12");
        transaction.setCreditDebitDescription("Mock Transaction");
        transaction.setClosingBalance("336336");
        List<Transaction> transactionList = Arrays.asList(transaction);
        Statement statement = new Statement();
        statement.setTransaction(transactionList);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(statement));
    }
}
