package com.example.emanager.utils;

import com.example.emanager.R;
import com.example.emanager.models.Category;

import java.util.ArrayList;

public class Constants {
    public static String INCOME = "INCOME";
    public static String EXPENSE = "EXPENSE";

    public static ArrayList<Category> categories;
    public static ArrayList<Category> cotegories;

    public static int DAILY = 0;
    public static int MONTHLY = 1;
    public static int CALENDAR = 2;
    public static int SUMMARY = 3;
    public static int NOTES = 4;

    public static int SELECTED_TAB = 0;
    public static int SELECTED_TAB_STATS = 0;
    public static String SELECTED_STATS_TYPE = Constants.INCOME;

    public static void setCotegories() {
        cotegories = new ArrayList<>();
        cotegories.add(new Category("Продукты",R.drawable.ic_product,R.color.category1));
        cotegories.add(new Category("Одежда",R.drawable.ic_shirt,R.color.category6));
        cotegories.add(new Category("Машина",R.drawable.ic_car,R.color.category3));
        cotegories.add(new Category("Камуналка",R.drawable.ic_home,R.color.category4));
        cotegories.add(new Category("Питомцы",R.drawable.ic_pet,R.color.category5));
        cotegories.add(new Category("Игры",R.drawable.game_ic,R.color.category2));

    }

    public static void  setCategories() {
        categories = new ArrayList<>();
        categories.add(new Category("Зарплата",R.drawable.ic_salary, R.color.category1));
        categories.add(new Category("Бизнес",R.drawable.ic_business, R.color.category2));
        categories.add(new Category("Инвестиции",R.drawable.ic_investment,R.color.category3));
        categories.add(new Category("Кредит",R.drawable.ic_loan,R.color.category4));
        categories.add(new Category("Аренда",R.drawable.ic_rent,R.color.category5));
        categories.add(new Category("Другое",R.drawable.ic_other,R.color.category6));

    }


    public static Category getCategoryDetails(String categoryName) {
        for (Category cat :
                categories) {
            if (cat.getCategoryName().equals(categoryName)) {
                return cat;
            }
        }
        return null;
    }
    public static Category getCotegoryDetails(String cotegoryName) {
        for (Category cot :
                cotegories) {
            if (cot.getCategoryName().equals(cotegoryName)) {
                return cot;
            }
        }
        return null;
    }

    public static int getAccountsColor(String accountName) {
        switch (accountName) {
            case "Bank":
                return R.color.bank_color;
            case "Cash":
                return R.color.cash_color;
            case "Card":
                return R.color.card_color;
            default:
                return R.color.default_color;
        }
    }

}
