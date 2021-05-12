//
//  ContentView.swift
//  LiveList
//
//  Created by user193205 on 5/11/21.
//

import SwiftUI

struct ContentView: View {
    var countryController = Countrycontroller()
    var body: some View {
        NavigationView{
            List(countryController.countries){
                country in Text(country.name)
            }.navigationBarTitle("Countries",displayMode: .inline)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
