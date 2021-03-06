import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import { UserCreateEditComponent } from './user-create-edit/user-create-edit.component';
import { ContactCreateEditComponent } from './contact-create-edit/contact-create-edit.component';
import { UserListComponent } from './user-list/user-list.component';
import { ContactListComponent } from './contact-list/contact-list.component';
import { NavbarComponent } from './SharedComponents/navbar/navbar.component';
import { AppRoutingModule } from './app-routing.modules';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserCreateEditComponent,
    ContactCreateEditComponent,
    UserListComponent,
    ContactListComponent,
    NavbarComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    MatIconModule   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
