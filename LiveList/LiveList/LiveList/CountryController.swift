//
//  CountryController.swift
//  LiveList
//
//  Created by user193205 on 5/11/21.
//

import Foundation
class Countrycontroller{
    var countries: [CountryModel]
    
    init() {
        self.countries = [
            CountryModel( id: UUID(), name:"Mexico", population: "127M"),
            CountryModel( id: UUID(), name:"Canada", population: "37M"),
            CountryModel( id: UUID(), name:"France", population: "67M"),
            CountryModel( id: UUID(), name:"Italy", population: "60M"),
            CountryModel( id: UUID(), name:"China", population: "1.3B"),
            
        ]
    }
    
}
