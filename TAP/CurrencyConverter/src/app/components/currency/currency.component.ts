import { Component, OnInit } from '@angular/core';
import { CurrencyService } from 'src/app/currency/currency.service';
import { Currency, CurrencyRate, CurrencySearch } from 'src/app/models/currency.model';

@Component({
  selector: 'app-currency',
  templateUrl: './currency.component.html',
  styleUrls: ['./currency.component.scss']
})
export class CurrencyComponent implements OnInit {
  currencies: Currency[] = [];
  baseCurrency: string = "EUR";
  rateCurrency: string = "EUR";
  amount: number = 0;
  rate: number = 0;

  constructor(private currencyService: CurrencyService) {}

  ngOnInit(): void {
    this.getAllCurrenciesData();
  }

  getAllCurrenciesData():void {
    this.currencyService.getAllCurrenciesData()
    .subscribe((currencySearch: CurrencySearch): void => {
      this.currencies = Object.values(currencySearch.data);
    })
  }

  getCurrencyExchangeRate():void {
    this.currencyService.getCurrencyExchangeRate(this.baseCurrency, this.rateCurrency)
    .subscribe((currencyRate: CurrencyRate): void => {
      this.rate = this.amount * currencyRate.data[this.rateCurrency];
    })
  }
}
