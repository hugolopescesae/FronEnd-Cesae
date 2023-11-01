export interface Currency {
    symbol: string;
    name: string;
    symbol_native: string;
    decimal_digits: number;
    rounding: number;
    code: string;
    name_plural: string;
}

export interface Data {
    [key: string]: number;
}

export interface CurrencyRate {
    data: Data;
}

export interface CurrencySearch {
    data: Currency;
}