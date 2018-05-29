//
//  ViewController.swift
//  MayTermProject
//
//  Created by Walt Boettge on 5/29/18.
//  Copyright © 2018 Walt Boettge. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var background: UIImageView!
    @IBOutlet weak var button: UIButton!
    @IBOutlet weak var onLabel: UILabel!
    @IBOutlet weak var offLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    
    @IBAction func buttonPressed(_ sender: Any) {
        if(onLabel.isHidden){
            onLabel.isHidden = false
            offLabel.isHidden = true
        }
        else{
            onLabel.isHidden = true
            offLabel.isHidden = false
        }
    }
    

}

