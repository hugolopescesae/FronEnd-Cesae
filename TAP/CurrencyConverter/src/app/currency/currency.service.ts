import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CurrencyRate, CurrencySearch } from '../models/currency.model';

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {
  private domain: string = "https://api.freecurrencyapi.com";
  private apikey: string = "fca_live_vA6fHVbQwHtvkxlqzQbPqp1VjuimFJdYZpYUZ9xs";

  constructor(private http: HttpClient) {}

  getAllCurrenciesData(): Observable<CurrencySearch> {
    return this.http.get<CurrencySearch>(`${this.domain}/v1/currencies?apikey=${this.apikey}`);
  }

  getCurrencyExchangeRate(baseCurrency: string, currency: string): Observable<CurrencyRate> {
    return this.http.get<CurrencyRate>(`${this.domain}/v1/latest?apikey=${this.apikey}&currencies=${currency}&base_currency=${baseCurrency}`);
  }
}
