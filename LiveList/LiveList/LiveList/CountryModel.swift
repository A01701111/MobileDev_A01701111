//
//  CountryModel.swift
//  LiveList
//
//  Created by user193205 on 5/11/21.
//

import Foundation

struct CountryModel: Identifiable,Hashable {
    var id: UUID
    var name: String
    var population: String
    
    func hash(into hasher: inout Hasher){
        hasher.combine(id)
        
    }
}
