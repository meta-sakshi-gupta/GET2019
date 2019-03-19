import { Component, OnInit } from '@angular/core';
import { user_array } from 'src/mock_user';
import { User } from '../user';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  //array of user defined in mock-user 
  array_of_user = user_array;
  selecetedUser : User;

  constructor() { }

  ngOnInit() {
  }

}
