import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarBody1Component } from './listar-body1.component';

describe('ListarBody1Component', () => {
  let component: ListarBody1Component;
  let fixture: ComponentFixture<ListarBody1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarBody1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarBody1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
