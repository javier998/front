import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearBody1Component } from './crear-body1.component';

describe('CrearBody1Component', () => {
  let component: CrearBody1Component;
  let fixture: ComponentFixture<CrearBody1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrearBody1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CrearBody1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
