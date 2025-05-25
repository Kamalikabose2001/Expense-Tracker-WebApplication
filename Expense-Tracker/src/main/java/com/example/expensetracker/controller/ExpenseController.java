package com.example.expensetracker.controller;

import org.springframework.ui.Model;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
public class ExpenseController {


    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Expense> expenses = expenseService.getAllExpense();
        BigDecimal totalAmount = expenses.stream().map(Expense::getAmount).reduce(BigDecimal.ZERO,BigDecimal::add);
        model.addAttribute("expenses",expenses);
        model.addAttribute("totalAmount",totalAmount);
        return "index";
    }
    @GetMapping("/addExpense")
    public String showAddExpensePage(Model model){
        Expense expense = new Expense();
        model.addAttribute("expense",expense);
        return "add-expense";

    }

    @PostMapping("/saveExpense")
    public String saveExpense(@Valid @ModelAttribute("expense")Expense expense, BindingResult result , Model model){

        if (result.hasErrors()){
            return "add-expense"; //return to form if validation fails
        }
        expenseService.saveExpense(expense);
        return "redirect:/";
    }
    @GetMapping("editExpense/{id}")
    public String showUpdateExpensePage(@PathVariable("id") long id, Model model){
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense",expense);
        return "update-expense";
    }

    @PostMapping("/updateExpense/{id}")
    public String updateExpense(@PathVariable("id") long id, @Valid @ModelAttribute("expense") Expense expense,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "update-expense";
        }
        Expense existingExpense = expenseService.getExpenseById(id);
        existingExpense.setDescription(expense.getDescription());
        existingExpense.setAmount(expense.getAmount());
        expenseService.saveExpense(existingExpense);
        return "redirect:/";
    }

    @GetMapping("/deleteExpense/{id}")
    public String deleteExpense(@PathVariable("id")long id){
        expenseService.deleteExpensebyId(id);
        return "redirect:/";
    }



}
