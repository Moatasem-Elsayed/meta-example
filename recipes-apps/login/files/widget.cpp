#include <QMessageBox>
#include <QtWidgets>
#include "widget.h"
#include <iostream>
#include <fstream>
#include <QLabel>
#include <QDebug>
// Constructor for main window
widget::widget(QWidget *parent)
{
    m_labelname[0] = new QLabel("first name", this);
    m_labelname[0]->setMinimumSize(70, 50);
    m_labelname[0]->move(10, 10);

    m_textname[0] = new QLineEdit(this);
    m_textname[0]->setMinimumSize(200, 50);
    m_textname[0]->move(100, 10);

    m_labelname[1] = new QLabel("password", this);
    m_labelname[1]->setMinimumSize(70, 50);
    m_labelname[1]->move(10, 70);

    m_textname[1] = new QLineEdit(this);
    m_textname[1]->setMinimumSize(200, 50);
    m_textname[1]->move(100, 70);

    m_button_ = new QPushButton(this);
    m_button_->setMinimumSize(50, 30);
    m_button_->setText("Login");
    m_button_->move(100, 140);

    connect(m_button_, &QPushButton::clicked, [&]()
            {
                qDebug() << "Fist name is " << m_textname[0]->text();
                qDebug() << "Password is  " << m_textname[1]->text();
                if(m_textname[0]->text()=="moatasem"&&m_textname[1]->text()=="0000")
                {
                    qDebug()<<"Successfully login";
                     m_textname[0]->setText("");
                     m_textname[1]->setText("");

                }else
                {
                    qDebug()<<"Please try again";
                } });
}
widget::~widget() {}