import { Component } from '@angular/core';
import { NavItem } from './nav-item';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  menu: NavItem [] = [
    {
      displayName: 'Home',
      iconName: 'home',
      route: '/home',
    },     
    {
      displayName: 'Artists',
      iconName: 'people',
      route: '/artist',
    },        
    {
      displayName: 'Teste 2',
      iconName: 'ballot',
      route: 'entradasGADE',
    },
    {
      displayName: 'Teste 3',
      iconName: 'description',          
      children: [
        {
          displayName: 'Teste 1',
          iconName: 'how_to_reg',
          route: '/misexpedientes'
        },
        { 
          displayName: 'Teste 2',
          iconName: 'waves',
          route: '/todos'
        },
        { 
          displayName: 'Teste 3',
          iconName: 'waves',
          route: '/todos'
        }
      ]
    },
    {
      displayName: 'Teste 4',
      iconName: 'group',
      children: [
          {
            displayName: 'Teste 1',
            iconName: 'search',
            route: '/busquedaperfiles'
          }
        ]
      }
  ];
}
